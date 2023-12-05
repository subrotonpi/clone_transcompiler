def _import ( ) :
    import sys
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.mod = math.pow ( a , b // 2 )
        def mod ( self ) :
            if not self.mod :
                return 1
            temp = self.modpow ( a , self.mod // 2 )
            temp = temp * 1 ** temp % mod
            if self.mod & 1 == 1 :
                temp = temp * a % mod
            return temp
        def main ( self ) :
            f = open ( "/proc/sys/stdin" )
            n = int ( f.readline ( ) )
            f = f.readline ( )
            array = [ ]
            mod = long ( 1E9 ) + 7
            cnt = [ 0 ] * n
            for i in range ( 1 , n + 1 ) :
                array.append ( int ( f.readline ( ) ) )
                cnt [ array [ i ] ] += 1
            if self.mod & 1 == 1 :
                for i in range ( 2 , len ( array ) , 2 ) :
                    if cnt [ i ] != 2 or cnt [ 0 ] != 1 :
                        print ( '0' )
                        return
                ways = self.modpow ( 2 , n // 2 )
                print ( ways )
            if self.mod & 1 == 0 :
                for i in range ( 1 , len ( array ) , 2 ) :
                    if cnt [ i ] != 2 :
                        print ( '0' , end = ' ' )
                        return
                ways = self.modpow ( 2 , n // 2 )
                print ( ways )
