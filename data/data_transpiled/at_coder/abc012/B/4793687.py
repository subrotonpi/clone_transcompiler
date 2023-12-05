def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = sys.maxint
        def run ( self ) :
            self.n = sys.maxint
    n = Main ( )
    n.run ( )
    hour = n.hour / 3600
    minute = ( n.minute - hour * 3600 ) / 60
    second = ( n.second - hour * 3600 - minute * 60 )
    formatted = '%02d' % hour + ':' + '%02d' % minute + ':' + '%02d' % second
    print ( formatted )
