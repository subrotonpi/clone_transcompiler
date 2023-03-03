def main ( ) :
    import sys
    from string import printable
    from string import printable
    n = printable.count ( " " )
    s = printable.split ( " " )
    max = 0
    for i in range ( 1 , n - 1 ) :
        count = 0
        for c in [ "a" , "z" ] :
            if printable [ : i ] in printable [ str ( c ) ] and printable [ i : ] in printable [ str ( c ) ] :
                count += 1
        if count > max :
            max = count
    print ( max )
