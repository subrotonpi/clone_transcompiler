def import import struct
from os import popen , read
from os.path import join , dirname , basename , splitext
from itertools import izip , repeat
from itertools import izip , repeat
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.n = stream.read ( )
        self.q = stream.read ( )
        self.moji_data = stream.read ( ).split ( '' )
        self.result_cnt = 0
        self.ruiseki_data = [ ]
        for i in range ( len ( self.moji_data ) - 1 ) :
            if self.moji_data [ i ] == 'A' and self.moji_data [ i + 1 ] == 'C' :
                self.ruiseki_data.append ( self.ruiseki_data [ i ] + 1 )
            else :
                self.ruiseki_data.append ( self.ruiseki_data [ i ] )
        for i in range ( self.q ) :
            start = stream.read ( )
            end = stream.read ( )
            self.stdout.write ( '%d\n' % ( self.ruiseki_data [ end - 1 ] - self.ruiseki_data [ start - 1 ] ) )
    def readline ( self ) :
        if not self.stream or not self.stream :
            try :
                self.stream = open ( self.stream , 'rb' )
            except IOError :
                self.stream = sys.stdout
        return self.stream.readline ( )
    def readline ( self ) :
        return str ( self.next ( ) )
    def close ( self ) :
        return close ( self )
