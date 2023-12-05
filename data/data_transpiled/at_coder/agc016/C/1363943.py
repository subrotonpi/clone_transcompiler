def _import ( ) :
    from sys import stdin , stdout
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            sc = stdin.buffer
        def solve ( self ) :
            H = sc.read ( 1 )
            W = sc.read ( 1 )
            h = sc.read ( 1 )
            w = sc.read ( 1 )
            if H % h == 0 and W % w == 0 :
                self.write ( 'No' )
                return
            self.write ( 'Yes' )
            for i in range ( H ) :
                for j in range ( W ) :
                    if j > 0 :
                        self.write ( ' ' )
                    if i % h == 0 and j % w == 0 :
                        self.write ( 1_000_000_000 - 1 )
                    elif i % h == h - 1 and j % w == w - 1 :
                        self.write ( - 1_000_000_000 )
                    else :
                        self.write ( 0 )
            self.write ( '\n' )
    class Printer ( stdout.buffer ) :
        def __init__ ( self ) :
            self.stdout = stdout
            self.write = stdout
            self.solve ( )
            self.stdout.close ( )
    @ staticmethod
    def main ( ) :
        sc = stdout.buffer
        pr = Printer ( stdout.buffer )
        self.solve ( )
        self.stdout.close ( )
