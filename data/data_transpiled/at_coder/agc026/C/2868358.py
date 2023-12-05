def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        s = self.s
        s1 = s [ : n ].decode ( 'utf-8' )
        s2 = list ( s [ n : 2 * n ] ).reverse ( ).decode ( 'utf-8' )
        map1 = { }
        map2 = { }
        for i in range ( ( 1 << n ) ) :
            red1 = [ ]
            blue1 = [ ]
            red2 = [ ]
            blue2 = [ ]
            for j in range ( n ) :
                if ( i >> j ) % 2 == 1 :
                    red1.append ( s1 [ j ] )
                    blue2.append ( s2 [ j ] )
                else :
                    blue1.append ( s1 [ j ] )
                    red2.append ( s2 [ j ] )
            key1 = ':'.join ( red1 ) + ':' + ':'.join ( blue1 )
            map1.compute ( key1 , lambda k , v : 1 if v is None else v + 1 )
            key2 = ':'.join ( red2 ) + ':' + ':' + ':'.join ( blue2 )
            map2.compute ( key2 , lambda k , v : 1 if v is None else v + 1 )
        sum = 0
        for key , value in map1.items ( ) :
            sum += value * map2.get ( key , None )
        print ( sum )
    def main ( ) :
        with open ( '/proc/main.py' , 'r' ) as f :
            f.write ( str ( sys.stdin.read ( ) ) )
