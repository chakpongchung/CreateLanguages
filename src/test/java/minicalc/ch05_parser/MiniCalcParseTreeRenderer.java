package minicalc.ch05_parser;

import org.antlr.v4.runtime.Vocabulary;
import org.minicalc.MiniCalcParser;

public final class MiniCalcParseTreeRenderer extends ParseTreeRenderer
{
    @Override
    public final Vocabulary vocabulary() {
        return MiniCalcParser.VOCABULARY;
    }
}
