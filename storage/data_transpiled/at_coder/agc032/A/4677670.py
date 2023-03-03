def import _sys , fac , inv , id , size
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.k = 1000000000 + 7 , 1000000000 + 7
        self.fac = fac , inv
        self.id = id
        self.size = size
        self.ans = [ ]
        self.flag = True
    def main ( self ) :
        with open ( self.n ) as sc :
            n = sc.read ( )
rec = [ ]
for i in range ( n ) :
    rec.append ( sc.read ( ) )
ans = list ( )
while len ( rec ) > 0 :
    idx = - 1
    for i in range ( len ( rec ) - 1 , - 1 , - 1 ) :
        if rec [ i ] == i + 1 :
            idx = i
            break
    if idx == - 1 :
        break
    ans.append ( rec [ idx ] )
    del rec [ idx ]
if len ( ans ) != n :
    print ( - 1 )
else :
    for w in ans :
        print ( w )
