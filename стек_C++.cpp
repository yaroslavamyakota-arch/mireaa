#include <iostream>
#include <stack>
#include <vector>
#include <string>
#include <sstream>
#include <algorithm>

using namespace std;
int main() {
    string input;
    
    getline(cin, input);
    
    stringstream ss(input);
    vector<int> inputNumbers;
    int num;
    
    while (ss >> num) {
        inputNumbers.push_back(num);
    }
    
    // Находим минимальное и максимальное значения
    int min_val = inputNumbers[0];
    int max_val = inputNumbers[0];
    
    for (size_t i = 1; i < inputNumbers.size(); i++) {
        if (inputNumbers[i] < min_val) min_val = inputNumbers[i];
        if (inputNumbers[i] > max_val) max_val = inputNumbers[i];
    }
    
    // Создаем стек и обрабатываем числа
    stack<int> resultStack;
    
    // Проходим с конца для сохранения порядка
    for (int i = inputNumbers.size() - 1; i >= 0; i--) {
        int current = inputNumbers[i];
        resultStack.push(current);
        if (current == max_val) {
            resultStack.push(min_val);
        }
    }
    
    // Выводим результат
    while (!resultStack.empty()) {
        cout << resultStack.top() << " ";
        resultStack.pop();
    }
    cout << endl;
    
    return 0;
}
