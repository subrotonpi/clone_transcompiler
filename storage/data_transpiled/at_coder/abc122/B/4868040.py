def __main__ ( ) :
    from string import ascii_letters
    sc = unicodedata.normalize ( 'NFKD' , ascii_letters )
    S = sc.next ( )
    i , max = 0 , 0
    for s in S :
        if isACGT ( s ) :
            length = 0
            for c in s :
                if not isACGT ( c ) :
                    break
                length += 1
            if max < length :
                max = length
    print ( max )
    def isACGT ( s ) :
        return s in [ 'A' , 'C' , 'G' , 'T' ]
    return isACGT
