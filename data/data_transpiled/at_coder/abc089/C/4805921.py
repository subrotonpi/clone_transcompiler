def main ( ) :
    import sys
    from string import ascii_letters
    reader = open ( 'r' , 'rb' )
    N = len ( reader.read ( ) )
    arr = [ 0 ] * 5
    str = 'MARCH'
    remain = 'MARCH'
    ans = 0
    for ch in reader.read ( ) :
        index = str.find ( ch )
        if index != - 1 :
            arr [ index ] += 1
            remain = remain.replace ( unichr ( index ) , '' )
    size = len ( str ) - len ( remain )
    if size < 3 :
        sys.stdout.write ( ans )
        return
    only = [ ]
    incre = [ ]
    count = 0
    current = 0
    while count < size :
        if arr [ current ] > 0 :
            only.append ( arr [ current ] )
            count += 1
        current += 1
    incre.append ( only [ size - 1 ] )
    for i in range ( size - 2 , 0 , - 1 ) :
        incre [ i ] = incre [ i + 1 ] + only [ i ]
    for i in range ( size - 2 ) :
        for j in range ( i + 1 , size - 1 ) :
            ans += only [ i ] * only [ j ] * incre [ j + 1 ]
    sys.stdout.write ( ans )
    reader.close ( )
