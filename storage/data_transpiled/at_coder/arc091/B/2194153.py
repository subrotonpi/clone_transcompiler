def import import sys
from os.path import join
from os import sep
from os import environ
from os import environ
from os import environ
from os import environ
bf = environ [ 'wsgi.input' ]
bf = bf.split ( sep )
n = int ( bf [ 0 ] )
k = int ( bf [ 1 ] )
ans = 0
for b in range ( 1 , n + 1 ) :
    if b <= k :
        continue
    remainders_per_b = b - 1 - k + 1
    ans += 1 * n / b * remainders_per_b
    if n % b >= k :
        ans += ( n % b ) - k + 1
    if k == 0 :
        ans -= 1
print ( ans )
