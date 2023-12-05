def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.mjs = sys.argv [ 1 ]
        def __call__ ( self , * args ) :
            if self.mjs % 2 == 0 :
                print ( - 1 )
                sys.exit ( 0 )
            else :
                times = ( self.mjs - 1 ) / 2
                st = 'b'
                for i in range ( 1 , times + 1 ) :
                    if i % 3 == 1 :
                        st = 'a' + st + 'c'
                    elif i % 3 == 2 :
                        st = 'c' + st + 'a'
                    elif i % 3 == 0 :
                        st = 'b' + st + 'b'
                if st == self.mjs :
                    print ( times )
                else :
                    print ( - 1 )
