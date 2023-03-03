def _ ( ) : return
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__main__ = sys.__main__
    def main ( self ) :
        with open ( self.__main__.__file__ ) as f :
            data = f.read ( )
            if self.__main__.read ( ) == self.__main__.getvalue ( ) :
                self.__main__.write ( "YES" )
            else :
                self.__main__.write ( "NO" )
    def __main__ ( self ) :
        if self.__main__.getvalue ( ) == self.__main__.getvalue ( ) :
            return True
        last = self.__main__.getvalue ( ).rfind ( "\n" )
        if self [ last ] == "o" or self [ last ] == "k" or self [ last ] == "u" :
            return self.__main__.read ( )
        elif self [ max ( 0 , last - 1 ) : last + 1 ] == "ch" :
            return self.__main__.read ( )
        else :
            return False
