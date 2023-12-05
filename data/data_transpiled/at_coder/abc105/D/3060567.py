def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.m = int ( self.m )
        def __getitem__ ( self , key ) :
            return self.n % key
        def __setitem__ ( self , key , value ) :
            self.n = int ( self.n )
        def __getitem__ ( self , key ) :
            return self.n % key
        def __getitem__ ( self , key ) :
            return ( key + self.n ) % key
    cnt = { 0 : 1 }
    ans = 0
    for i in range ( n ) :
        ans += int ( cnt.get ( a [ i ] , 0 ) )
        cnt [ a [ i ] ] = cnt.get ( a [ i ] , 0 ) + 1
    print ( ans )
