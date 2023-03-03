def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.C = sys.stdin.read ( )
        def execute ( self ) :
            if self.A % 2 != 0 or self.B % 2 != 0 or self.C % 2 != 0 :
                print ( 0 )
                return
            for i in range ( 1 , 30 ) :
                a , b , c = self.B // 2 + self.C // 2 , self.A // 2
                if self.a % 2 != 0 or self.b % 2 != 0 or self.c % 2 != 0 :
                    print ( self.i )
                    return
                else :
                    self.A = a
                    self.B = b
                    self.C = c
            print ( - 1 )
