def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = len ( sys.argv )
        def run ( self ) :
            with open ( self.n ) as sc :
                A = [ sc.randint ( 0 , n ) for i in range ( self.n ) ]
                K = [ sc.randint ( 0 , n ) for i in range ( self.n ) ]
                grundy = 0
                for i in range ( self.n ) :
                    A [ i ] = sc.randint ( 0 , n )
                    K [ i ] = sc.randint ( 0 , n )
                    grundy ^= f ( A [ i ] , K [ i ] )
                if grundy == 0 :
                    print ( "Aoki" )
                else :
                    print ( "Takahashi" )
        def f ( self , A , K ) :
            if A % K == 0 :
                return A / K
            else :
                tmp = ( A % K ) / ( A / K + 1 )
                if tmp > 1 :
                    return f ( self , A - ( A / K + 1 ) * tmp , K )
                else :
                    return f ( self , A - A / K - 1 , K )
