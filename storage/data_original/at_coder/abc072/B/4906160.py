s = input()

a=[]
for i in range(len(s)):
    if((i+1)%2!=0):
        a += s[i]

#list??????join???????.?????????????????????????
moziretu = "".join(a)

print(moziretu)