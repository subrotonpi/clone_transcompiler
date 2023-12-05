def import _main
import sys
import os
import sys
import string
import string
import string
import sys
import string
import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        input_text = sc.read ( )
        set = set ( string.ascii_lowercase )
        if len ( set ) == 26 :
            print ( 'None' )
            return
        char = 'a'
        for i in range ( 26 ) :
            if str ( char ) in set :
                char += 1
                continue
            print ( char )
            break
