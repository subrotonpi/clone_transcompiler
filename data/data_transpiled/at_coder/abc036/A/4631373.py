def main ( ) :
    class Main ( object ) :
        _sc = sys._getframe ( 1 )
        A = _sc.f_code
        B = _sc.f_code
        if B % A == 0 :
            pprint ( ( B / A ) )
        else :
            pprint ( ( B / A + 1 ) )
    class Main ( object ) :
        def __init__ ( self , what ) :
            print ( what )
            sys._getframe ( 1 ).f_code.co_name = ""
        def _print ( self , what ) :
            print ( "[%d] %s" % ( self.__code.co_varnames [ self.__code.co_argcount ] , self.__code.co_varnames [ self.__code.co_argcount ] ) )
    class Main ( object ) :
        def __init__ ( self , what ) :
            if isinstance ( what , str ) :
                print ( "[%d] %s" % ( self.__code.co_name , self.__code.co_varnames [ self.__code.co_argcount ] ) )
            else :
                print ( what.__name__ )
    class Main ( object ) :
        def __init__ ( self , what ) :
            self.what = what
