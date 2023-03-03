def import _main
class Main ( object ) :
    class Num :
        def __init__ ( self , a , log ) :
            self.a = a
            self.log = log
    MOD = 1000000007
    def main ( self ) :
        with open ( "/proc/self/" , "r" ) as sc :
            N = sc.readline ( ).strip ( )
            A = sc.readline ( ).strip ( )
            B = sc.readline ( ).strip ( )
            num = [ ]
            for a in sc.readlines ( ) :
                num.append ( Num ( a , math.log ( a ) ) )
            if A == 1 :
                num.sort ( key = lambda n1 : n1.a - n2.a )
                for i in range ( N ) : print ( num [ i ].a )
                sc.close ( )
                return
            add = math.log ( A )
            min = 0.0
            max = 1e11
            for i in range ( 80 ) :
                mid = ( min + max ) / 2
                sum = 0
                for j in range ( N ) :
                    if num [ j ].log < mid :
                        sum += ( mid - num [ j ].log ) / add
                if sum >= B :
                    max = mid
                else :
                    min = mid
            sum = 0
            for i in range ( N ) :
                if num [ i ].log < min :
                    num [ i ].cnt = int ( ( min - num [ i ].log ) / add )
                sum += num [ i ].cnt
            while sum < B :
                idx = 0
                for i in range ( 1 , N ) :
                    if num [ i ].log + add * num [ i ].cnt < num [ idx ].log + add * num [ idx ].cnt :
                        idx = i
                    num [ idx ].cnt += 1
                sum += 1
            num.sort ( key = lambda n1 : float ( n1.log + add * n1.cnt ) )
    return Main
