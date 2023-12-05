def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.c0 , self.c1 = 0 , 0
            data = None
            with open ( "input.txt" , "r" ) as f :
                data = f.read ( )
                for s in data.split ( "\n" ) :
                    if s == "0" :
                        self.c0 += 1
                    else :
                        self.c1 += 1
    if c0 < c1 :
        print ( c0 * 2 )
    else :
        print ( c1 * 2 )
