def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.i , self.j = 0 , 0
            a = self.a
            x = self.stdin.readline ( )
            for k in range ( 1 , len ( x ) + 1 ) :
                xx = x [ k - 1 : k ]
                if xx == '(' :
                    self.i += 1
                else :
                    self.i -= 1
                if self.i < 0 :
                    self.j += 1
                    self.i = 0
            for f in range ( self.j ) :
                print ( '(' , end = ' ' )
            print ( x , end = ' ' )
            for f in range ( self.i ) :
                print ( ')' , end = ' ' )
