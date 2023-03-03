def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = 0
        def __next__ ( self ) :
            if self.N % 111 == 0 :
                self.__next__ ( )
            else :
                a = self.N // 111 + 1
                self.__next__ ( )
    return Main ( )
