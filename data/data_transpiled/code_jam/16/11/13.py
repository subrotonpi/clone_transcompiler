def main ( ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.C = len ( sys.stdin )
    for thiscase in range ( 1 , C + 1 ) :
        input = sys.stdin.readline ( )
        sys.stdout.write ( 'Case #%d: %s\n' % ( thiscase , get_last_word ( input ) ) )
    def get_last_word ( str ) :
        if len ( str ) == 1 :
            return str
        elif len ( str ) == 0 :
            return ''
        index_of_largest_letter = 0
        arr = str.split ( ' ' )
        for i in range ( 1 , len ( arr ) ) :
            if arr [ i ] >= arr [ index_of_largest_letter ] :
                index_of_largest_letter = i
        stuff_before = get_last_word ( str [ : index_of_largest_letter ] )
        stuff_after = str [ index_of_largest_letter + 1 : ]
        return arr [ index_of_largest_letter ] + stuff_before + stuff_after
