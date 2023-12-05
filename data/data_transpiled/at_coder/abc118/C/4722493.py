def _game_mons ( mons , a_index , b_index ) :
    import sys
    from itertools import chain
    from itertools import chain
    if len ( mons ) < 2 :
        return
    a = mons [ a_index ]
    b = mons [ b_index ]
    mons [ b_index ] = b % a
    if b % a == 0 :
        del mons [ b_index ]
        yield chain ( mons [ : b_index ] , mons [ b_index : ] )
        yield chain ( mons [ b_index : ] , mons [ a_index : ] )
    else :
        yield chain ( mons [ b_index : ] , mons [ a_index : ] )
    def game_mons ( mons ) :
        mons.sort ( lambda a , b : cmp ( a , b ) )
        yield chain ( mons [ : b_index ] , mons [ a_index : ] )
        yield chain ( mons [ : b_index ] , mons [ a_index : ] )
    def main ( ) :
        with open ( "/proc/main.txt" , "r" ) as f :
            N = len ( f.readlines ( ) )
        result = game_mons ( mons )
        yield result
