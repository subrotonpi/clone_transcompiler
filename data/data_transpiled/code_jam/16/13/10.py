def main ( ) :
    import sys
    from itertools import count
    for case_num in range ( 1 , num_cases + 1 ) :
        N = count ( 'N' )
        F = [ ]
        for i in range ( 1 , N + 1 ) :
            F.append ( i )
        longest_in = [ ]
        is_pair = [ False ]
        num_pairs = 0
        longest_with_pair = 0
        longest_cycle = 0
        for i in range ( 1 , N + 1 ) :
            offsets = [ ]
            index = i
            offset = 1
            length = 0
            while 1 :
                length += 1
                offsets.append ( offset )
                index += 1
                next_index = F [ index ]
                if offsets [ next_index ] != 0 :
                    cycle = offset - offsets [ next_index ]
                    if cycle == 2 :
                        longest_with_pair = max ( longest_with_pair , length )
                        if not ( is_pair [ index ] or is_pair [ next_index ] ) :
                            is_pair [ index ] = is_pair [ next_index ] = True
                            num_pairs += 1
                        longest_in.append ( max ( longest_in , length - 2 ) )
                    else :
                        longest_cycle = max ( longest_cycle , cycle )
                    break
                else :
                    index = next_index
        total_chains = 0
        for i in range ( 1 , N + 1 ) :
            if F [ F [ i ] ] == i and i < F [ i ] :
                total_chains += longest_in [ i ] + longest_in [ F [ i ] ] + 2
        print ( 'Case #%d: %d' % ( case_num , max ( longest_cycle , total_chains ) ) )
