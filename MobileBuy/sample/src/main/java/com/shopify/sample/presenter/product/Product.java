/*
 *   The MIT License (MIT)
 *
 *   Copyright (c) 2015 Shopify Inc.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */

package com.shopify.sample.presenter.product;

import android.support.annotation.NonNull;

import java.math.BigDecimal;
import java.util.List;

public final class Product {
  @NonNull private final String id;
  @NonNull private final String title;
  @NonNull private final String description;
  @NonNull private List<String> tags;
  @NonNull private List<String> images;
  @NonNull private List<Option> options;
  @NonNull private List<Variant> variants;

  public Product(@NonNull final String id, @NonNull final String title, @NonNull final String description, @NonNull final List<String> tags,
    @NonNull final List<String> images, @NonNull final List<Option> options, @NonNull final List<Variant> variants) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.tags = tags;
    this.images = images;
    this.options = options;
    this.variants = variants;
  }

  @NonNull public String id() {
    return id;
  }

  @NonNull public String title() {
    return title;
  }

  @NonNull public String description() {
    return description;
  }

  @NonNull public List<String> tags() {
    return tags;
  }

  @NonNull public List<String> images() {
    return images;
  }

  @NonNull public List<Option> options() {
    return options;
  }

  @NonNull public List<Variant> variants() {
    return variants;
  }

  @Override public String toString() {
    return "Product{" +
      "id='" + id + '\'' +
      ", title='" + title + '\'' +
      ", description='" + description + '\'' +
      ", tags=" + tags +
      ", images=" + images +
      ", options=" + options +
      ", variants=" + variants +
      '}';
  }

  public static final class Option {
    @NonNull private final String id;
    @NonNull private final String name;
    @NonNull private final List<String> values;

    public Option(@NonNull final String id, @NonNull final String name, @NonNull final List<String> values) {
      this.id = id;
      this.name = name;
      this.values = values;
    }

    @NonNull public String id() {
      return id;
    }

    @NonNull public String name() {
      return name;
    }

    @NonNull public List<String> values() {
      return values;
    }

    @Override public String toString() {
      return "Option{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", values=" + values +
        '}';
    }
  }

  public static final class SelectedOption {
    @NonNull private final String name;
    @NonNull private final String value;

    public SelectedOption(@NonNull final String name, @NonNull final String value) {
      this.name = name;
      this.value = value;
    }

    @NonNull public String name() {
      return name;
    }

    @NonNull public String value() {
      return value;
    }

    @Override public String toString() {
      return "SelectedOption{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
    }
  }

  public static final class Variant {
    @NonNull private final String id;
    @NonNull private final String title;
    private final boolean available;
    @NonNull private final List<SelectedOption> selectedOptions;
    @NonNull private final BigDecimal price;

    public Variant(@NonNull final String id, @NonNull final String title, final boolean available,
      @NonNull final List<SelectedOption> selectedOptions, @NonNull final BigDecimal price) {
      this.id = id;
      this.title = title;
      this.available = available;
      this.selectedOptions = selectedOptions;
      this.price = price;
    }

    @NonNull public String id() {
      return id;
    }

    @NonNull public String title() {
      return title;
    }

    public boolean isAvailable() {
      return available;
    }

    @NonNull public List<SelectedOption> selectedOptions() {
      return selectedOptions;
    }

    @NonNull public BigDecimal price() {
      return price;
    }

    @Override public String toString() {
      return "Variant{" +
        "id='" + id + '\'' +
        ", title='" + title + '\'' +
        ", available=" + available +
        ", selectedOptions=" + selectedOptions +
        ", price=" + price +
        '}';
    }
  }


}
