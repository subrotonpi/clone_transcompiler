def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
            self.data = [ 'F' , 'D' , 'C' , 'B' , 'A' ]
            s = self.data [ 'A' ]
            ans = 0
            for i in range ( self.n ) :
                for j in range ( 0 , 4 ) :
                    if s [ j ] == s [ i ] :
                        ans += j
                        break
            print ( ans / self.n )
