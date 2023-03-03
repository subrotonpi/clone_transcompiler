def import re
import sys
import re
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        pattern = re.compile ( r'[^0-9]' )
        match = re.search ( pattern , sc.read ( ) )
        ans = match.group ( 1 )
        print ( ans )
