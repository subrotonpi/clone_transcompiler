def main ( args ) :
    import sys
    from collections import defaultdict
    from os.path import join
    infile = open ( 'A-small-attempt0.in' , 'r' )
    outfile = open ( 'A-small.out' , 'w' )
    T = int ( infile.readline ( ) )
    for i in range ( T ) :
        adj = defaultdict ( list )
        for s in infile :
            s = s.split ( )
            s = s [ 0 : N ]
            s = s [ N : ]
            for r in range ( N ) :
                s = infile.readline ( )
                s = s [ : M ]
                for c in range ( M ) :
                    d = int ( s [ c ] ) - 1
                    adj [ r ] [ d ].append ( True )
        ans = False
        for n in range ( N ) :
            q = [ n ]
            v = defaultdict ( list )
            while not q.empty ( ) :
                x = q.pop ( )
                if v [ x ] :
                    ans = True
                    break
                v [ x ].append ( True )
                for m in range ( N ) :
                    if adj [ x ] [ m ] :
                        q.append ( m )
        outfile.write ( 'Case #{}: {}\n'.format ( i + 1 , 'Yes' if ans else 'No' ) )
    outfile.close ( )
