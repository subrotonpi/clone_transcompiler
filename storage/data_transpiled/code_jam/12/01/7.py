def _ ( ) : return 'our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up aoz'
s1 = 'ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv yeq'
def __init__ ( self , * args ) :
    c1 , c2 = 0 , 0
    for a in ( 'a' , 'z' ) :
        if a in s2 :
            self.missing_char = a
            c2 += 1
        if a in s1 :
            self.missing_translate = a
            c1 += 1
    assert c1 == c2 and c1 <= 1
    with open ( 'Googlereese.txt' , 'r' ) as f :
        n = len ( f.readlines ( ) )
        f.readline ( )
        for i in range ( 1 , n + 1 ) :
            print ( 'Case #%d: ' % i , end = '' )
            line = f.readline ( )
            chars = line.split ( )
            out = [ ]
            for c in chars :
                out.append ( map ( lambda x : x.upper ( ) , c ) )
            print ( out )
    def map ( char ) :
        if char == missing_char : return missing_translate
        else : return s1 [ s2.index ( char ) ]
