s = input()
A,B,C,D = s[0],s[1],s[2],s[3]

for op1,op2,op3 in [("+","+","+"),("+","+","-"),("+","-","+"),("+","-","-"),("-","+","+"),("-","+","-"),("-","-","+"),("-","-","-")]:
    if eval(A+op1+B+op2+C+op3+D) == 7:
        print(A+op1+B+op2+C+op3+D+"=7")
        break