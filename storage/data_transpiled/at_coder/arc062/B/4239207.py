def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 's1' )
    s = sc.read ( )
    count = 0
    for i in s :
        if i == 'p' :
            count += 1
    print ( len ( s ) / 2 - count )
