def mark_game ( lenge , N ) :
    from itertools import islice
    from random import randint
    from random import choice
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import shuffle
    from random import choice
    N = shuffle ( lenge )
    M = shuffle ( lenge )
    data = [ choice ( lenge ) for _ in range ( M ) ]
    lenge = [ ]
    for i in range ( M ) :
        data.append ( shuffle ( lenge ) )
    data.sort ( lambda a , b : cmp ( a , b ) )
    for i in range ( M - 1 ) :
        lenge.append ( abs ( data [ i ] - data [ i + 1 ] ) )
    lenge.sort ( lambda a , b : cmp ( a , b ) )
    if N >= M :
        print ( 0 )
    else :
        print ( mark_game ( lenge , N ) )
    shuffle ( lenge )
