def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__help__ = sys.__help__
    def __init__ ( self , H , W , h , w ) :
        self.__help__ = H * W - h * W - H * w + h * w
