def main ( ) :
    import sys
    from itertools import izip
    from itertools import izip
    from itertools import izip
    n = len ( sys.stdin.readline ( ) )
    list = [ ]
    for l in izip ( n , range ( n ) ) :
        b = izip ( l , [ ] )
        list.append ( b )
    max = 0
    ans = ''
    count = 0
    for com in list :
        for x in list :
            if x == com :
                count += 1
            if count > max :
                max = count
                ans = x
        count = 0
    print ( ans )
