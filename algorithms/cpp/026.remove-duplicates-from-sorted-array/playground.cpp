#include<iostream>
#include<algorithm>
#include <sstream>

#include<vector>
#include<unordered_map>

#include "removeDuplicates.h"
#include "../playground.h"

int main() {
    string line;
    while (getline(cin, line)) {
        vector<int> nums = stringToIntegerVector(line);

        int ret = Solution().removeDuplicates(nums);

        string out = integerVectorToString(nums, ret);
        cout << out << endl;
    }
    return 0;
}
