def import import _sys , _sys , _imp
from time import time
class Main ( object ) :
    def __init__ ( self , index , num ) :
        self.index = index
        self.num = num
    def is_even_or_odd ( self , even_or_odd ) :
        return ( self.index % 2 == even_or_odd )
    def __lt__ ( self , o ) :
        return cmp ( self.num , o.num )
    def solve ( self ) :
        lst = list ( _sys.modules.values ( ) )
        try :
            with _sys.stdin.fileno ( ) as f :
                N = _sys.stdin.read ( )
                for i in range ( N ) :
                    lst.append ( _sys.stdin.read ( ) )
        lst.sort ( key = None )
        count = 0
        index = 0
        for n in lst :
            if n.is_even_or_odd ( index % 2 ) is False :
                count += 1
            index += 1
        return count / 2
    def main ( self ) :
        main = _sys ( self )
        print ( main.solve ( ) )
