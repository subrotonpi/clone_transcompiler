def main ( ) :
    class Main ( object ) :
        _scanner = _scanner
        s , t = _scanner.scanner ( )
        _match = re.compile ( '(.*)' + t.replace ( '.' , '[$0?]' ) + '(.*?)' )
        print ( _match.group ( 1 ).replace ( '$1' , t ).replace ( '?' , 'a' ) if _match else 'UNRESTORABLE' )
