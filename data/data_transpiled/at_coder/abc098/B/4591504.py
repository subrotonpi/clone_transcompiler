def main ( ) :
    import sys
    from string import ascii_letters
    reader = open ( 'input.txt' , 'r' )
    K = len ( reader.read ( ) )
    S = reader.read ( )
    ans = 0
    for i in range ( 1 , K ) :
        tmp = 0
        bf = S [ : i ]
        af = S [ i : ]
        while bf :
            if af.find ( bf [ 0 ] ) != - 1 :
                tmp += 1
            bf = bf.rstrip ( u'' )
        if tmp > ans :
            ans = tmp
    reader.close ( )
    sys.stdout.write ( ans )
