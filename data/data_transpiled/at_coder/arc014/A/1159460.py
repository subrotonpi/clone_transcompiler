def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.__ret = 0
        def __call__ ( self , * args ) :
            if self.__ret % 2 == 0 :
                print ( "Blue" )
            else :
                print ( "Red" )
    return Main
