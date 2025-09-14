def stack_eff(input_data):
    num = list(map(int, input_data.split()))
    
    if not num:
        return []
    
    minn = min(num)
    maxx = max(num)
    
    stack = num.copy()
    res = []
    
    while stack:
        num = stack.pop()
        res.append(num)
        if num == maxx:
            res.append(minn)
    
    fin = []
    while res:
        fin.append(res.pop())
    
    return fin

input_data = str(input())
output = stack_eff(input_data)
print(" ".join(map(str, output)))
