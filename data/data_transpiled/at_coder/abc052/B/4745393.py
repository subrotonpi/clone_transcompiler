def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 's1' )
    s = sc.read ( )
    s = sc.read ( )
    max = sum = 0
    for i in s :
        if i [ 0 ] == 'I' :
            sum += 1
        if i [ 0 ] == 'D' :
            sum -= 1
        max = max + sum
    print ( max )
