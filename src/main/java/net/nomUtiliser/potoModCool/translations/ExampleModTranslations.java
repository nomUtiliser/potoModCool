package net.nomUtiliser.potoModCool.translations;

import net.minheur.potoflux.translations.AbstractTranslationsRegistry;
import your.packagename.potoflexMod;

public class ExampleModTranslations extends AbstractTranslationsRegistry {
    public ExampleModTranslations() {
        super(potoflexMod.MOD_ID);
    }

    @Override
    protected void makeTranslation() {
        addYourTab("name")
                .en("Your tab name");
        addYourTab("title")
                .en("Your tab title");
    }

    // tabs helper
    private TranslationBuilder addYourTab(String... children) {
        return addTab("yourTab", children);
    }
}
