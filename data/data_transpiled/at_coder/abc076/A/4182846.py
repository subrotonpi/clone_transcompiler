def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__main__ = sys.__main__
    def main ( self ) :
        R = sys.argv [ 1 ]
        G = sys.argv [ 2 ]
        performance = G * 2 - R
        print ( performance )
