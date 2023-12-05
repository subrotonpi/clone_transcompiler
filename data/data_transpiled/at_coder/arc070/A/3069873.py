def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        pass
    def main ( self ) :
        with open ( "/proc/self/" ) as f :
            k = f.read ( )
        c = 0
        for i in range ( 1 ) :
            c = c + i
            if k <= c :
                print ( i )
                break
