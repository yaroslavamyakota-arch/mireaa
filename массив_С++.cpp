#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    cout << "Original list: ";
    // создание массива A с числами и пустого массива В для нечетных чисел
    vector<int> A = {1, 5, 2, 7, 6, 9};
    vector<int> B;
    
    // вывод массива A
    for (int num : A) {
        cout << num << " ";
    }
    cout << endl;
    
    // поиск нечетных чисел
    for (int num : A) {
        if (num % 2 != 0) {
            // добавление нечетного числа в массив B
            B.push_back(num);
        }
    }
    cout << "Odd numbers: ";
    // вывод массива В
    for (int num : B) {
        cout << num << " ";
    }
    cout << endl;
    return 0;
}
