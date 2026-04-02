class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int sum_gas=0;
        int sum_cost=0;
        for(int i=0;i<gas.size();i++){
            sum_gas+=gas[i];
            sum_cost+=cost[i];
        }
        if(sum_cost>sum_gas)return -1;
        vector<int> temp_gas;
        vector<int> temp_cost;
        for(int i=0;i<gas.size();i++){
            temp_gas.push_back(gas[i]);
            temp_cost.push_back(cost[i]);
        }
        for(int i=0;i<gas.size();i++){
            temp_gas.push_back(gas[i]);
            temp_cost.push_back(cost[i]);
        }
        int index=-1;
        int total_gas=0;
        for(int i=0;i<temp_gas.size()-1;i++){
            int to=i+1;
            // std::cout<<"from: "<<i<<"to: "<<to<<"total_gas: "<<total_gas<<"gas_curr: "<<temp_gas[i]<<"total_cost: "<<temp_cost;
            total_gas+=temp_gas[i];
            if(index==(to%gas.size())&&total_gas>=temp_cost[i])return index;
            total_gas-=temp_cost[i];
            if(total_gas<0){
                total_gas=0;
                index=-1;
            }
            else if(index==-1)index=i;
            // std::cout<<"from: "<<i<<" to: "<<to<<" total_gas: "<<total_gas<<" gas_curr: "<<temp_gas[i]<<" cost: "<<temp_cost[i]<<endl;
        }
        return index;
    }
};