import math

n,k = [int(i) for i in input().split()]
a = [int(i) for i in input().split()]

##x?bit?
bit_num = math.floor(math.log2(max(max(a),k)))+1

###num_one?A????????1??
num_one = []
for i in range(bit_num):
  ###?A????1????
  num_one_tmp = 0
  for j in a:
    num_one_tmp += (j >> i) & 1
  num_one.append(num_one_tmp)
#print(num_one)
  
if k == 0:
  bit_k = 1
else:
  bit_k = math.floor(math.log2(k))+1

###???bit_k???bit?0?????????bit_k-1???bit?0,1?????k?????
###???bit_k???bit?1??????
###???bit_k-1???bit?0?????????0??????????bit_k?????
###?????k????bit????????0,1??????????
###0?????????????ans?????
###??????????????0,1????????????????????

###??bit_k??????
constant_ans = 0
for i in range(bit_k,bit_num):
  constant_ans += num_one[i] * 2**i

ans = 0

###bit_k?????
for i in range(bit_k)[::-1]:
  
  ###0????????
  if 2**i > k:
    constant_ans += num_one[i] * 2**i
  
  ###0,1?????
  else:
    ###0?????
    variant_ans = num_one[i] * 2**i
    ###i-1??bit???????????
    for j in range(i):
      ###?????????????x?0????xor????1???num_one????
      if num_one[j] >= (n+1)//2:
        variant_ans += num_one[j] * 2**j
      ###0????????????x?1????xor????1???n-num_one????
      else:
        variant_ans += (n-num_one[j]) * 2**j
    ans = max(ans,constant_ans+variant_ans)

    ###1?????
    constant_ans += (n-num_one[i]) * 2**i
    k -= 2**i
  #print(k)
  #print(constant_ans)
  
ans = max(ans,constant_ans)
print(ans)