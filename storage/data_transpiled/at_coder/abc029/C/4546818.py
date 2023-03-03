def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
        def __call__ ( self , * args , ** kwargs ) :
            self.n = args [ 0 ]
        def Print ( self , pos , s ) :
            if pos == 1 :
                print ( s , "a" )
                print ( s , "b" )
                print ( s , "c" )
            else :
                print ( pos - 1 , s + "a" )
                print ( pos - 1 , s + "b" )
                print ( pos - 1 , s + "c" )
