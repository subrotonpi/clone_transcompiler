def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__main__ = sys.__main__
    def main ( self ) :
        with open ( self.__main__.name , 'r' ) as sc :
            W = sc.read ( )
            for char in W :
                if char in [ 'a' , 'i' , 'u' , 'e' , 'o' ] :
                    continue
                else :
                    sys.stdout.write ( char )
        print ( )
