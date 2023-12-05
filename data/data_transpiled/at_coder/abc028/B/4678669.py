def import _dict2dict
import os
import re
import csv
class Main ( object ) :
    def __init__ ( self ) :
        sc = csv.reader ( open ( '/etc/init.d' ) )
        dict = defaultdict ( int )
        s = sc.next ( )
        A = [ 'A' , 'B' , 'C' , 'D' , 'E' , 'F' ]
        for i in range ( 6 ) :
            dict [ A [ i ] ] = 0
        for S in s :
            dict [ S ] = dict [ S ] + 1
        print ( dict [ 'A' ] , dict [ 'B' ] , dict [ 'C' ] , dict [ 'D' ] , dict [ 'E' ] , dict [ 'F' ] )
