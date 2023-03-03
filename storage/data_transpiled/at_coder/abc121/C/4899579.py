def main ( ) :
    from numpy import array
    from numpy import arange
    from numpy import array
    from os import getenv
    from os import path
    from os.path import join
    sc = open ( path ( join ( dirname ( __file__ ) , '../data' ) ) )
    data = [ ]
    line_list = sc.readline ( ).split ( )
    N , M = [ int ( i ) for i in line_list ]
    for i in range ( N ) :
        line_list = sc.readline ( ).split ( )
        data.append ( ( int ( line_list [ 0 ] ) , int ( line_list [ 1 ] ) ) )
    data.sort ( lambda a , b : a < b )
    kingaku = 0
    for data in data :
        if M < data [ 'suryou' ] :
            kingaku = kingaku + M * data [ 'tanka' ]
            break
        else :
            kingaku = kingaku + data [ 'suryou' ] * data [ 'tanka' ]
            M = M - data [ 'suryou' ]
    print ( kingaku )
    class Data ( object ) :
        def __init__ ( self , p_tanka , p_suryou ) :
            self.tanka = p_tanka
            self.suryou = p_suryou
        def __eq__ ( self , d ) :
            if self.tanka < d [ 'tanka' ] : return - 1
            if self.tanka > d [ 'tanka' ] : return 1
            return 0
        def tanka ( self ) :
            return self.tanka
        def settanka ( self , tanka ) :
            self.tanka = tanka
            self.suryou = self.suryou
        def getsuryou ( self ) :
            return self.suryou
    return Data ( )
