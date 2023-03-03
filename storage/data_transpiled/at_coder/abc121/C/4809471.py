def main ( ) :
    from time import sleep
    r = sleep ( 1 )
    r ( )
    def run ( ) :
        with open ( '/proc/%d/run.txt' % ( sys.argv [ 0 ] ) , 'r' ) as sc :
            n = sc.read ( )
            m = sc.read ( )
            dr = [ ( sc.read ( ) , sc.read ( ) ) for i in range ( n ) ]
            dr.sort ( key = lambda x : x [ 1 ] )
            cnt = 0
            ans = 0
            for i in range ( n ) :
                if dr [ i ] [ 1 ] + cnt <= m :
                    cnt += dr [ i ] [ 1 ]
                    ans += dr [ i ] [ 0 ] * dr [ i ] [ 1 ]
                else :
                    ans += dr [ i ] [ 0 ] * ( m - cnt )
                    break
            print ( ans )
    class Drink ( object ) :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
        def geta ( self ) :
            return a
        def getb ( self ) :
            return b
    return Drink ( run )
