def main ( args ) :
    import os , sys
    from r1c.main import main as main
    from r1c.main import main as main
    infile = open ( 'R1C-small.in' , 'r' )
    in2 = open ( 'R1C-calc' , 'r' )
    outfile = open ( 'R1C-small.out' , 'w' )
    cas = main ( infile , args )
    ans = [ in2.read ( ) ] * 31
    for i in range ( 1 , 30 ) :
        ans [ i ] = outfile.read ( )
    outer :
        for iii , N in enumerate ( cas ) :
            print ( 'Case #%d: %s' % ( iii + 1 , ans [ N ] ) , file = outfile )
